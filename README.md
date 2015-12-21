bdmem: Big Data Memory Library
================================
Big Data Memory Library (BDML) is a JVM-based persistent layer for in-place structured data processing and computing.
It is a solution for generic object persistence and block persistence on heterogeneous block and byte-addressable devices, such as DRAM, SSD, NVMe, persistent memory, network storage, etc.

The design motivation for this library is to create a persistent memory programming paradigm for in-memory data object persistence, in-memory data objects caching, and JNI-less IPC. BDML simplifies the usage of data object caching, persistence, and JNI-less IPC for massive object oriented structural datasets.
Major features of BDML:
• Provides an abstract level of viewpoint to utilize heterogeneous block/byte-addressable device as a whole (e.g., DRAM, persistent memory, NVMe, SSD, HD, Cloud/Network Storage, etc.).
• Provides seamless support object oriented design and programming without adding burden to transfer object data to different form.
• Avoids the object data serialization/de-serialization for data retrieval, caching and storage.
• Reduces the consumption of on-heap memory and in turn to alleviate JVM GC overheads and stabilize GC pauses for latency sensitive applications.
• Overcomes current limitations of JVM GC to manage much larger memory resources for massive dataset processing and computing.
• Supports the migration data usage model from traditional SSD/HD/NVMe to non-volatile memory with ease.
• Avoids unnecessary memory consumption if some data does not need to use for computing immediately.
• Bypasses JNI call for the interaction between JVM runtime application and its native code.
• Provides an allocation aware auto-reclaim mechanism to prevent external memory resource leaking.

Please see the file LICENSE for information on how this library is licensed.
This tree contains a library for using Java Big Data Memory.
Here you'll find:

[JavaDoc: https://bigdata-memory.github.io/bigdata-memory](TBD)

* **src** -- the source for the library
* **src/main/java** -- the Java source for the library
* **examples** -- Brief examples for this library
* **src/main/native** -- the native source for the library
* **src/test/java** -- the Java test & example source for the library
* **uml** -- modeling documents for the library
* **target** -- the generated packages for the library
* **target/apidocs** -- the generated API documents for the library

To build this library, you may need to install some required packages on the build system:

* **Linux** -- the native code depends on Linux System only
* **NVML** -- the Linux NVM library (Tag: 0.1+b16) (http://pmem.io)
* **JDK** -- the Java Develop Kit 1.8 or above (please properly configure JAVA_HOME)
* **Maven** -- the software project management tool for compiling Java project and resolve its dependences
* **Autotools** -- the GNU build system for compiling native project
* **PMFS** -- the PMFS should be properly installed and configured on Linux system if you want to simulate read latency
* **PMalloc** -- the supported durable memory native library at https://github.com/bigdata-memory/pmalloc.git
* **Javapoet** -- the 1.3.1-SNAPSHOT revised for bdmem at https//github.com/wewela/javapoet.git

Once the build system is setup, the Big Memory Library is built using this command at the top level:
```bash
	$ mvn clean package -DskipTests -Dmaven.javadoc.skip=true -Dmaven.test.skip=true
```

To build and run the unit tests:
```bash
	$ mvn clean package
```

To install this package to local repository:
```bash
  $ mvn clean install
```

To build examples:  
(Note that the Big Data Memory Library should be installed to local repository at first):
```bash
  $ cd examples
  $ mvn clean package
```

To run an example:
```bash
  $ cd examples
  $ java -jar target/examples-X.X.X(-SSSSS).jar
```
