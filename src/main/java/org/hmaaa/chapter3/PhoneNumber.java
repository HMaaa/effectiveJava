package org.hmaaa.chapter3;

public class PhoneNumber {

  private final short areaCode, prefix, lineNum;

  public PhoneNumber(int areaCode, int prefix, int lineNum) throws IllegalAccessException {
    this.areaCode = rangeCheck(areaCode, 999, "지역 코드");
    this.prefix = rangeCheck(prefix, 999, "프리픽스");
    this.lineNum = rangeCheck(lineNum, 999, "가입자 번호");
  }

  private static short rangeCheck(int val, int max, String arg) throws IllegalAccessException {
    if (val < 0 || val > max) {
      throw new IllegalAccessException(arg + ": " + val);
    }
    return (short) val;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof PhoneNumber))
      return false;
    PhoneNumber pn = (PhoneNumber) o;
    return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
  }

  @Override
  public String toString() {
    return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
  }

}
