package org.hmaaa.chapter2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class firstLineOfFile {

  static final int BUFFER_SIZE = 80;

  static String firstLineOfFile(String path) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(path));
    try {
      return br.readLine();
    } finally {
      br.close();
    }
  }

  static void copy(String src, String dst) throws IOException {
    InputStream in = new FileInputStream(src);
    try {
      OutputStream out = new FileOutputStream(dst);
      try {
        byte[] buf = new byte[BUFFER_SIZE];
        int n;
        while ((n = in.read(buf)) >= 0) {
          out.write(buf, 0, n);
        }
      } finally {
        out.close();
      }
    } finally {
      in.close();
    }
  }

  // try-with-resources 이용해 자원을 회수하는 최선책
  static String firstLineOfFile2(String path) throws IOException {
    try (BufferedReader br = new BufferedReader(
        new FileReader(path))) {
      return br.readLine();
    }
  }

  // 복수의 자원을 처리하는 try-with-resources
  static void copy2(String src, String dst) throws IOException {
   try (InputStream in = new FileInputStream(src);
       OutputStream out = new FileOutputStream(dst)
   ) {
     byte[] buf = new byte[BUFFER_SIZE];
     int n;
     while ((n = in.read(buf)) >= 0) {
       out.write(buf, 0, n);
     }
   }
  }

  // try-with-resources, catch 절 같이 사용
  static String firstLineOfFile3(String path, String defaultVal) {
    try (BufferedReader br = new BufferedReader(
        new FileReader(path)
    )) {
      return br.readLine();
    } catch (IOException e) {
      return defaultVal;
    }
  }

}
