#
# There is insufficient memory for the Java Runtime Environment to continue.
# Native memory allocation (malloc) failed to allocate 1491856 bytes for Chunk::new
# Possible reasons:
#   The system is out of physical RAM or swap space
#   The process is running with CompressedOops enabled, and the Java Heap may be blocking the growth of the native heap
# Possible solutions:
#   Reduce memory load on the system
#   Increase physical memory or swap space
#   Check if swap backing store is full
#   Decrease Java heap size (-Xmx/-Xms)
#   Decrease number of Java threads
#   Decrease Java thread stack sizes (-Xss)
#   Set larger code cache with -XX:ReservedCodeCacheSize=
#   JVM is running with Unscaled Compressed Oops mode in which the Java heap is
#     placed in the first 4GB address space. The Java Heap base address is the
#     maximum limit for the native heap growth. Please use -XX:HeapBaseMinAddress
#     to set the Java Heap base and to place the Java Heap above 4GB virtual address.
# This output file may be truncated or incomplete.
#
#  Out of Memory Error (allocation.cpp:389), pid=142340, tid=0x0000000000021488
#
# JRE version: OpenJDK Runtime Environment (8.0_242-b01) (build 1.8.0_242-release-1644-b01)
# Java VM: OpenJDK 64-Bit Server VM (25.242-b01 mixed mode windows-amd64 compressed oops)
# Failed to write core dump. Minidumps are not enabled by default on client versions of Windows
#

---------------  T H R E A D  ---------------

Current thread (0x0000000016b07000):  JavaThread "C2 CompilerThread0" daemon [_thread_in_native, id=136328, stack(0x0000000018170000,0x0000000018270000)]

Stack: [0x0000000018170000,0x0000000018270000]
[error occurred during error reporting (printing stack bounds), id 0xc0000005]

Native frames: (J=compiled Java code, j=interpreted, Vv=VM code, C=native code)


Current CompileTask:
C2: 202065 6559       4       groovy.lang.MetaClassImpl::inheritInterfaceNewMetaMethods (199 bytes)


---------------  P R O C E S S  ---------------

Java Threads: ( => current thread )
  0x00000000195b3000 JavaThread "Memory manager" [_thread_blocked, id=129652, stack(0x00000000233f0000,0x00000000234f0000)]
  0x00000000195ae800 JavaThread "Cache worker for Build Output Cleanup Cache (C:\Users\sjosu\AndroidStudioProjects\MDComponents\.gradle\buildOutputCleanup)" [_thread_blocked, id=145132, stack(0x000000001ee60000,0x000000001ef60000)]
  0x00000000195a9000 JavaThread "Build operations Thread 4" [_thread_blocked, id=146772, stack(0x00000000222f0000,0x00000000223f0000)]
  0x00000000195ad000 JavaThread "Build operations Thread 3" [_thread_blocked, id=148108, stack(0x00000000221f0000,0x00000000222f0000)]
  0x00000000195ac000 JavaThread "Build operations Thread 2" [_thread_blocked, id=148352, stack(0x0000000020cd0000,0x0000000020dd0000)]
  0x00000000195a8800 JavaThread "Build operations" [_thread_blocked, id=143740, stack(0x000000001b2f0000,0x000000001b3f0000)]
  0x00000000195aa000 JavaThread "Cache worker for execution history cache (C:\Users\sjosu\.gradle\caches\5.4.1\executionHistory)" [_thread_blocked, id=131476, stack(0x00000000205d0000,0x00000000206d0000)]
  0x0000000019570000 JavaThread "Cache worker for cache directory md-rule (C:\Users\sjosu\.gradle\caches\5.4.1\md-rule)" [_thread_blocked, id=143632, stack(0x00000000204d0000,0x00000000205d0000)]
  0x000000001956b000 JavaThread "Cache worker for cache directory md-supplier (C:\Users\sjosu\.gradle\caches\5.4.1\md-supplier)" [_thread_blocked, id=139400, stack(0x0000000002e90000,0x0000000002f90000)]
  0x000000001956f800 JavaThread "Cache worker for file hash cache (C:\Users\sjosu\AndroidStudioProjects\MDComponents\.gradle\5.4.1\fileHashes)" [_thread_blocked, id=142952, stack(0x000000001eb60000,0x000000001ec60000)]
  0x000000001956c800 JavaThread "Cache worker for journal cache (C:\Users\sjosu\.gradle\caches\journal-1)" [_thread_blocked, id=145380, stack(0x000000001b8f0000,0x000000001b9f0000)]
  0x000000001956d000 JavaThread "File lock request listener" [_thread_in_native, id=141480, stack(0x000000001b7f0000,0x000000001b8f0000)]
  0x000000001956b800 JavaThread "Cache worker for file hash cache (C:\Users\sjosu\.gradle\caches\5.4.1\fileHashes)" [_thread_blocked, id=146668, stack(0x000000001b4f0000,0x000000001b5f0000)]
  0x0000000019a34000 JavaThread "Thread-9" [_thread_blocked, id=148268, stack(0x000000001b3f0000,0x000000001b4f0000)]
  0x0000000019a22800 JavaThread "Asynchronous log dispatcher for DefaultDaemonConnection: socket connection from /127.0.0.1:49239 to /127.0.0.1:49240" [_thread_blocked, id=144608, stack(0x000000001b1f0000,0x000000001b2f0000)]
  0x0000000018674000 JavaThread "Daemon worker" [_thread_in_native, id=146724, stack(0x000000001b0f0000,0x000000001b1f0000)]
  0x0000000018673800 JavaThread "Cancel handler" [_thread_blocked, id=147452, stack(0x000000001aff0000,0x000000001b0f0000)]
  0x0000000018722800 JavaThread "Handler for socket connection from /127.0.0.1:49239 to /127.0.0.1:49240" [_thread_in_native, id=148044, stack(0x000000001acf0000,0x000000001adf0000)]
  0x0000000019061800 JavaThread "Daemon" [_thread_blocked, id=145320, stack(0x000000001abf0000,0x000000001acf0000)]
  0x0000000019064800 JavaThread "Daemon periodic checks" [_thread_blocked, id=145540, stack(0x000000001aaf0000,0x000000001abf0000)]
  0x0000000019063800 JavaThread "Incoming local TCP Connector on port 49239" [_thread_in_native, id=147880, stack(0x000000001a880000,0x000000001a980000)]
  0x0000000019c0a800 JavaThread "Daemon health stats" [_thread_blocked, id=145604, stack(0x000000001a240000,0x000000001a340000)]
  0x0000000016b5c800 JavaThread "Service Thread" daemon [_thread_blocked, id=146940, stack(0x0000000018870000,0x0000000018970000)]
  0x0000000018388800 JavaThread "C1 CompilerThread2" daemon [_thread_blocked, id=146616, stack(0x0000000018770000,0x0000000018870000)]
  0x0000000016b0b000 JavaThread "C2 CompilerThread1" daemon [_thread_blocked, id=146784, stack(0x0000000018270000,0x0000000018370000)]
=>0x0000000016b07000 JavaThread "C2 CompilerThread0" daemon [_thread_in_native, id=136328, stack(0x0000000018170000,0x0000000018270000)]
  0x0000000016b04000 JavaThread "Attach Listener" daemon [_thread_blocked, id=147584, stack(0x0000000018070000,0x0000000018170000)]
  0x0000000016b01000 JavaThread "Signal Dispatcher" daemon [_thread_blocked, id=148124, stack(0x0000000017f70000,0x0000000018070000)]
  0x000000000318b000 JavaThread "Finalizer" daemon [_thread_blocked, id=143956, stack(0x0000000017d50000,0x0000000017e50000)]
  0x0000000016ae9000 JavaThread "Reference Handler" daemon [_thread_blocked, id=146916, stack(0x0000000017c50000,0x0000000017d50000)]
  0x0000000002e8e000 JavaThread "main" [_thread_blocked, id=147596, stack(0x0000000002f90000,0x0000000003090000)]

Other Threads:
  0x0000000016ac6800 VMThread [stack: 0x0000000017b50000,0x0000000017c50000] [id=147016]
  0x0000000016b5d800 WatcherThread [stack: 0x0000000018970000,0x0000000018a70000] [id=147012]

VM state:not at safepoint (normal execution)

VM Mutex/Monitor currently owned by a thread: None

heap address: 0x00000000a0000000, size: 1536 MB, Compressed Oops mode: 32-bit
Narrow klass base: 0x0000000000000000, Narrow klass shift: 3
Compressed class space size: 1073741824 Address: 0x0000000100000000

Heap:
 PSYoungGen      total 37376K, used 18382K [0x00000000e0000000, 0x00000000e3080000, 0x0000000100000000)
  eden space 31744K, 49% used [0x00000000e0000000,0x00000000e0f34ed8,0x00000000e1f00000)
  from space 5632K, 49% used [0x00000000e2480000,0x00000000e273ecb8,0x00000000e2a00000)
  to   space 5632K, 0% used [0x00000000e1f00000,0x00000000e1f00000,0x00000000e2480000)
 ParOldGen       total 62976K, used 35774K [0x00000000a0000000, 0x00000000a3d80000, 0x00000000e0000000)
  object space 62976K, 56% used [0x00000000a0000000,0x00000000a22ef8f8,0x00000000a3d80000)
 Metaspace       used 65589K, capacity 67724K, committed 67968K, reserved 1107968K
  class space    used 8780K, capacity 9295K, committed 9344K, reserved 1048576K

Card table byte_map: [0x0000000012550000,0x0000000012860000] byte_map_base: 0x0000000012050000

Marking Bits: (ParMarkBitMap*) 0x000000006baef030
 Begin Bits: [0x0000000012e60000, 0x0000000014660000)
 End Bits:   [0x0000000014660000, 0x0000000015e60000)

Polling page: 0x0000000002e00000

CodeCache: size=245760Kb used=21468Kb max_used=21473Kb free=224292Kb
 bounds [0x0000000003190000, 0x00000000046a0000, 0x0000000012190000]
 total_blobs=6896 nmethods=6079 adapters=730
 compilation: enabled

Compilation events (10 events):
Event: 201.710 Thread 0x0000000016b0b000 6777       4       java.lang.String::replace (127 bytes)
Event: 201.727 Thread 0x0000000016b0b000 nmethod 6777 0x00000000046891d0 code [0x0000000004689320, 0x0000000004689798]
Event: 201.727 Thread 0x0000000018388800 6778       1       org.gradle.launcher.daemon.protocol.OutputMessage::getEvent (5 bytes)
Event: 201.727 Thread 0x0000000018388800 nmethod 6778 0x0000000004688f10 code [0x0000000004689060, 0x0000000004689170]
Event: 201.753 Thread 0x0000000018388800 6779       3       com.google.common.collect.RegularImmutableMap::makeImmutable (44 bytes)
Event: 201.754 Thread 0x0000000018388800 nmethod 6779 0x000000000468a890 code [0x000000000468aa40, 0x000000000468b258]
Event: 201.754 Thread 0x0000000018388800 6781       3       com.google.common.collect.AbstractIndexedListIterator::next (31 bytes)
Event: 201.754 Thread 0x0000000018388800 nmethod 6781 0x000000000468a150 code [0x000000000468a2e0, 0x000000000468a738]
Event: 201.754 Thread 0x0000000018388800 6780       1       com.android.build.gradle.options.BooleanOption::getPropertyName (5 bytes)
Event: 201.754 Thread 0x0000000018388800 nmethod 6780 0x0000000004688c50 code [0x0000000004688da0, 0x0000000004688eb0]

GC Heap History (10 events):
Event: 187.323 GC heap before
{Heap before GC invocations=29 (full 3):
 PSYoungGen      total 32768K, used 1413K [0x00000000e0000000, 0x00000000e2680000, 0x0000000100000000)
  eden space 27136K, 0% used [0x00000000e0000000,0x00000000e0000000,0x00000000e1a80000)
  from space 5632K, 25% used [0x00000000e2100000,0x00000000e2261580,0x00000000e2680000)
  to   space 6144K, 0% used [0x00000000e1a80000,0x00000000e1a80000,0x00000000e2080000)
 ParOldGen       total 47104K, used 30754K [0x00000000a0000000, 0x00000000a2e00000, 0x00000000e0000000)
  object space 47104K, 65% used [0x00000000a0000000,0x00000000a1e088d8,0x00000000a2e00000)
 Metaspace       used 57484K, capacity 59056K, committed 59160K, reserved 1099776K
  class space    used 7695K, capacity 8105K, committed 8192K, reserved 1048576K
Event: 187.735 GC heap after
Heap after GC invocations=29 (full 3):
 PSYoungGen      total 32768K, used 0K [0x00000000e0000000, 0x00000000e2680000, 0x0000000100000000)
  eden space 27136K, 0% used [0x00000000e0000000,0x00000000e0000000,0x00000000e1a80000)
  from space 5632K, 0% used [0x00000000e2100000,0x00000000e2100000,0x00000000e2680000)
  to   space 6144K, 0% used [0x00000000e1a80000,0x00000000e1a80000,0x00000000e2080000)
 ParOldGen       total 62976K, used 30449K [0x00000000a0000000, 0x00000000a3d80000, 0x00000000e0000000)
  object space 62976K, 48% used [0x00000000a0000000,0x00000000a1dbc700,0x00000000a3d80000)
 Metaspace       used 57479K, capacity 59038K, committed 59160K, reserved 1099776K
  class space    used 7694K, capacity 8102K, committed 8192K, reserved 1048576K
}
Event: 190.147 GC heap before
{Heap before GC invocations=30 (full 3):
 PSYoungGen      total 32768K, used 27136K [0x00000000e0000000, 0x00000000e2680000, 0x0000000100000000)
  eden space 27136K, 100% used [0x00000000e0000000,0x00000000e1a80000,0x00000000e1a80000)
  from space 5632K, 0% used [0x00000000e2100000,0x00000000e2100000,0x00000000e2680000)
  to   space 6144K, 0% used [0x00000000e1a80000,0x00000000e1a80000,0x00000000e2080000)
 ParOldGen       total 62976K, used 30449K [0x00000000a0000000, 0x00000000a3d80000, 0x00000000e0000000)
  object space 62976K, 48% used [0x00000000a0000000,0x00000000a1dbc700,0x00000000a3d80000)
 Metaspace       used 59755K, capacity 61570K, committed 61696K, reserved 1101824K
  class space    used 7998K, capacity 8438K, committed 8448K, reserved 1048576K
Event: 190.172 GC heap after
Heap after GC invocations=30 (full 3):
 PSYoungGen      total 33280K, used 2874K [0x00000000e0000000, 0x00000000e2c00000, 0x0000000100000000)
  eden space 27136K, 0% used [0x00000000e0000000,0x00000000e0000000,0x00000000e1a80000)
  from space 6144K, 46% used [0x00000000e1a80000,0x00000000e1d4e9c0,0x00000000e2080000)
  to   space 6144K, 0% used [0x00000000e2600000,0x00000000e2600000,0x00000000e2c00000)
 ParOldGen       total 62976K, used 30521K [0x00000000a0000000, 0x00000000a3d80000, 0x00000000e0000000)
  object space 62976K, 48% used [0x00000000a0000000,0x00000000a1dce710,0x00000000a3d80000)
 Metaspace       used 59755K, capacity 61570K, committed 61696K, reserved 1101824K
  class space    used 7998K, capacity 8438K, committed 8448K, reserved 1048576K
}
Event: 192.545 GC heap before
{Heap before GC invocations=31 (full 3):
 PSYoungGen      total 33280K, used 30010K [0x00000000e0000000, 0x00000000e2c00000, 0x0000000100000000)
  eden space 27136K, 100% used [0x00000000e0000000,0x00000000e1a80000,0x00000000e1a80000)
  from space 6144K, 46% used [0x00000000e1a80000,0x00000000e1d4e9c0,0x00000000e2080000)
  to   space 6144K, 0% used [0x00000000e2600000,0x00000000e2600000,0x00000000e2c00000)
 ParOldGen       total 62976K, used 30521K [0x00000000a0000000, 0x00000000a3d80000, 0x00000000e0000000)
  object space 62976K, 48% used [0x00000000a0000000,0x00000000a1dce710,0x00000000a3d80000)
 Metaspace       used 61335K, capacity 63278K, committed 63360K, reserved 1103872K
  class space    used 8260K, capacity 8750K, committed 8832K, reserved 1048576K
Event: 192.559 GC heap after
Heap after GC invocations=31 (full 3):
 PSYoungGen      total 37888K, used 1984K [0x00000000e0000000, 0x00000000e2b80000, 0x0000000100000000)
  eden space 32256K, 0% used [0x00000000e0000000,0x00000000e0000000,0x00000000e1f80000)
  from space 5632K, 35% used [0x00000000e2600000,0x00000000e27f0000,0x00000000e2b80000)
  to   space 6144K, 0% used [0x00000000e1f80000,0x00000000e1f80000,0x00000000e2580000)
 ParOldGen       total 62976K, used 32519K [0x00000000a0000000, 0x00000000a3d80000, 0x00000000e0000000)
  object space 62976K, 51% used [0x00000000a0000000,0x00000000a1fc1eb8,0x00000000a3d80000)
 Metaspace       used 61335K, capacity 63278K, committed 63360K, reserved 1103872K
  class space    used 8260K, capacity 8750K, committed 8832K, reserved 1048576K
}
Event: 199.033 GC heap before
{Heap before GC invocations=32 (full 3):
 PSYoungGen      total 37888K, used 34240K [0x00000000e0000000, 0x00000000e2b80000, 0x0000000100000000)
  eden space 32256K, 100% used [0x00000000e0000000,0x00000000e1f80000,0x00000000e1f80000)
  from space 5632K, 35% used [0x00000000e2600000,0x00000000e27f0000,0x00000000e2b80000)
  to   space 6144K, 0% used [0x00000000e1f80000,0x00000000e1f80000,0x00000000e2580000)
 ParOldGen       total 62976K, used 32519K [0x00000000a0000000, 0x00000000a3d80000, 0x00000000e0000000)
  object space 62976K, 51% used [0x00000000a0000000,0x00000000a1fc1eb8,0x00000000a3d80000)
 Metaspace       used 63094K, capacity 65052K, committed 65280K, reserved 1105920K
  class space    used 8476K, capacity 8934K, committed 8960K, reserved 1048576K
Event: 199.050 GC heap after
Heap after GC invocations=32 (full 3):
 PSYoungGen      total 35328K, used 3262K [0x00000000e0000000, 0x00000000e2a00000, 0x0000000100000000)
  eden space 31744K, 0% used [0x00000000e0000000,0x00000000e0000000,0x00000000e1f00000)
  from space 3584K, 91% used [0x00000000e1f80000,0x00000000e22afbc0,0x00000000e2300000)
  to   space 5632K, 0% used [0x00000000e2480000,0x00000000e2480000,0x00000000e2a00000)
 ParOldGen       total 62976K, used 33695K [0x00000000a0000000, 0x00000000a3d80000, 0x00000000e0000000)
  object space 62976K, 53% used [0x00000000a0000000,0x00000000a20e7eb8,0x00000000a3d80000)
 Metaspace       used 63094K, capacity 65052K, committed 65280K, reserved 1105920K
  class space    used 8476K, capacity 8934K, committed 8960K, reserved 1048576K
}
Event: 200.550 GC heap before
{Heap before GC invocations=33 (full 3):
 PSYoungGen      total 35328K, used 35006K [0x00000000e0000000, 0x00000000e2a00000, 0x0000000100000000)
  eden space 31744K, 100% used [0x00000000e0000000,0x00000000e1f00000,0x00000000e1f00000)
  from space 3584K, 91% used [0x00000000e1f80000,0x00000000e22afbc0,0x00000000e2300000)
  to   space 5632K, 0% used [0x00000000e2480000,0x00000000e2480000,0x00000000e2a00000)
 ParOldGen       total 62976K, used 33695K [0x00000000a0000000, 0x00000000a3d80000, 0x00000000e0000000)
  object space 62976K, 53% used [0x00000000a0000000,0x00000000a20e7eb8,0x00000000a3d80000)
 Metaspace       used 64061K, capacity 66180K, committed 66432K, reserved 1105920K
  class space    used 8591K, capacity 9088K, committed 9088K, reserved 1048576K
Event: 200.574 GC heap after
Heap after GC invocations=33 (full 3):
 PSYoungGen      total 37376K, used 2811K [0x00000000e0000000, 0x00000000e3080000, 0x0000000100000000)
  eden space 31744K, 0% used [0x00000000e0000000,0x00000000e0000000,0x00000000e1f00000)
  from space 5632K, 49% used [0x00000000e2480000,0x00000000e273ecb8,0x00000000e2a00000)
  to   space 5632K, 0% used [0x00000000e1f00000,0x00000000e1f00000,0x00000000e2480000)
 ParOldGen       total 62976K, used 35774K [0x00000000a0000000, 0x00000000a3d80000, 0x00000000e0000000)
  object space 62976K, 56% used [0x00000000a0000000,0x00000000a22ef8f8,0x00000000a3d80000)
 Metaspace       used 64061K, capacity 66180K, committed 66432K, reserved 1105920K
  class space    used 8591K, capacity 9088K, committed 9088K, reserved 1048576K
}

Deoptimization events (10 events):
Event: 198.521 Thread 0x0000000018674000 Uncommon trap: reason=class_check action=maybe_recompile pc=0x000000000420e514 method=groovy.lang.MetaMethod.isStatic()Z @ 1
Event: 198.521 Thread 0x0000000018674000 Uncommon trap: reason=class_check action=maybe_recompile pc=0x000000000420e514 method=groovy.lang.MetaMethod.isStatic()Z @ 1
Event: 199.335 Thread 0x0000000018674000 Uncommon trap: reason=class_check action=maybe_recompile pc=0x00000000036b1f40 method=java.lang.Throwable.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V @ 24
Event: 199.595 Thread 0x0000000018674000 Uncommon trap: reason=class_check action=maybe_recompile pc=0x00000000036b1f40 method=java.lang.Throwable.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V @ 24
Event: 199.680 Thread 0x0000000018674000 Uncommon trap: reason=unloaded action=reinterpret pc=0x0000000004437b54 method=sun.reflect.generics.factory.CoreReflectionFactory.makeNamedType(Ljava/lang/String;)Ljava/lang/reflect/Type; @ 11
Event: 199.680 Thread 0x0000000018674000 Uncommon trap: reason=class_check action=maybe_recompile pc=0x00000000036b1f40 method=java.lang.Throwable.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V @ 24
Event: 200.257 Thread 0x0000000018674000 Uncommon trap: reason=unstable_if action=reinterpret pc=0x000000000334a014 method=java.lang.String.replace(CC)Ljava/lang/String; @ 2
Event: 200.317 Thread 0x0000000018674000 Uncommon trap: reason=unstable_if action=reinterpret pc=0x0000000003eaaef8 method=org.codehaus.groovy.runtime.metaclass.MetaMethodIndex.copyNonPrivateNonNewMetaMethods(Lorg/codehaus/groovy/runtime/metaclass/MetaMethodIndex$Entry;Lorg/codehaus/groovy/runti
Event: 200.320 Thread 0x0000000018674000 Uncommon trap: reason=unstable_if action=reinterpret pc=0x0000000003dc5370 method=groovy.lang.MetaClassImpl$1MOPIter.methodNameAction(Ljava/lang/Class;Lorg/codehaus/groovy/runtime/metaclass/MetaMethodIndex$Entry;)V @ 182
Event: 200.513 Thread 0x0000000018674000 Uncommon trap: reason=unstable_if action=reinterpret pc=0x0000000003d5a4d8 method=org.codehaus.groovy.runtime.metaclass.MetaMethodIndex.addMethodToList(Ljava/lang/Object;Lgroovy/lang/MetaMethod;)Ljava/lang/Object; @ 256

Classes redefined (0 events):
No events

Internal exceptions (10 events):
Event: 200.715 Thread 0x0000000018674000 Exception <a 'java/lang/ClassNotFoundException': java/util/LinkedHashMapBeanInfo> (0x00000000e01bc8f8) thrown at [C:\src\AOSP-openjdk-git\hotspot\src\share\vm\classfile\systemDictionary.cpp, line 210]
Event: 200.716 Thread 0x0000000018674000 Exception <a 'java/lang/ClassNotFoundException': java/util/HashMapBeanInfo> (0x00000000e01c4240) thrown at [C:\src\AOSP-openjdk-git\hotspot\src\share\vm\classfile\systemDictionary.cpp, line 210]
Event: 200.716 Thread 0x0000000018674000 Exception <a 'java/lang/ClassNotFoundException': java/util/AbstractMapBeanInfo> (0x00000000e01ccb78) thrown at [C:\src\AOSP-openjdk-git\hotspot\src\share\vm\classfile\systemDictionary.cpp, line 210]
Event: 200.717 Thread 0x0000000018674000 Exception <a 'java/lang/ClassNotFoundException': java/util/AbstractMapCustomizer> (0x00000000e01d55a8) thrown at [C:\src\AOSP-openjdk-git\hotspot\src\share\vm\classfile\systemDictionary.cpp, line 210]
Event: 200.718 Thread 0x0000000018674000 Exception <a 'java/lang/ClassNotFoundException': java/util/HashMapCustomizer> (0x00000000e01e9d78) thrown at [C:\src\AOSP-openjdk-git\hotspot\src\share\vm\classfile\systemDictionary.cpp, line 210]
Event: 200.720 Thread 0x0000000018674000 Exception <a 'java/lang/ClassNotFoundException': java/util/LinkedHashMapCustomizer> (0x00000000e0212068) thrown at [C:\src\AOSP-openjdk-git\hotspot\src\share\vm\classfile\systemDictionary.cpp, line 210]
Event: 200.728 Thread 0x0000000018674000 Exception <a 'java/lang/ClassNotFoundException': org/gradle/api/plugins/internal/DefaultJavaPluginConventionBeanInfo> (0x00000000e029c778) thrown at [C:\src\AOSP-openjdk-git\hotspot\src\share\vm\classfile\systemDictionary.cpp, line 210]
Event: 200.729 Thread 0x0000000018674000 Exception <a 'java/lang/ClassNotFoundException': org/gradle/api/plugins/JavaPluginConventionBeanInfo> (0x00000000e02c2170) thrown at [C:\src\AOSP-openjdk-git\hotspot\src\share\vm\classfile\systemDictionary.cpp, line 210]
Event: 200.730 Thread 0x0000000018674000 Exception <a 'java/lang/ClassNotFoundException': org/gradle/api/plugins/JavaPluginConventionCustomizer> (0x00000000e02e7f88) thrown at [C:\src\AOSP-openjdk-git\hotspot\src\share\vm\classfile\systemDictionary.cpp, line 210]
Event: 200.732 Thread 0x0000000018674000 Exception <a 'java/lang/ClassNotFoundException': org/gradle/api/plugins/internal/DefaultJavaPluginConventionCustomizer> (0x00000000e0332898) thrown at [C:\src\AOSP-openjdk-git\hotspot\src\share\vm\classfile\systemDictionary.cpp, line 210]

Events (10 events):
Event: 201.868 loading class com/android/build/gradle/internal/SupportToolsComponents
Event: 201.868 loading class com/android/build/gradle/internal/SupportToolsComponents done
Event: 201.870 loading class com/android/build/gradle/internal/SupportToolsComponents$Companion
Event: 201.870 loading class com/android/build/gradle/internal/SupportToolsComponents$Companion done
Event: 201.871 loading class com/android/build/gradle/internal/SdkParsingUtilsKt
Event: 201.871 loading class com/android/build/gradle/internal/SdkParsingUtilsKt done
Event: 201.873 loading class com/android/sdklib/repository/meta/DetailsTypes
Event: 201.874 loading class com/android/sdklib/repository/meta/DetailsTypes done
Event: 201.914 loading class com/android/repository/api/ConsoleProgressIndicator
Event: 201.914 loading class com/android/repository/api/ConsoleProgressIndicator done


Dynamic libraries:
0x00007ff760600000 - 0x00007ff760631000 	C:\Program Files\Android\Android Studio\jre\bin\java.exe
0x00007ffe99230000 - 0x00007ffe99425000 	C:\WINDOWS\SYSTEM32\ntdll.dll
0x00007ffe97280000 - 0x00007ffe9733e000 	C:\WINDOWS\System32\KERNEL32.DLL
0x00007ffe96a50000 - 0x00007ffe96d19000 	C:\WINDOWS\System32\KERNELBASE.dll
0x00007ffe98ba0000 - 0x00007ffe98c4c000 	C:\WINDOWS\System32\ADVAPI32.dll
0x00007ffe97f30000 - 0x00007ffe97fce000 	C:\WINDOWS\System32\msvcrt.dll
0x00007ffe97ce0000 - 0x00007ffe97d7b000 	C:\WINDOWS\System32\sechost.dll
0x00007ffe98f10000 - 0x00007ffe9903a000 	C:\WINDOWS\System32\RPCRT4.dll
0x00007ffe989e0000 - 0x00007ffe98b81000 	C:\WINDOWS\System32\USER32.dll
0x00007ffe96ee0000 - 0x00007ffe96f02000 	C:\WINDOWS\System32\win32u.dll
0x00007ffe98cd0000 - 0x00007ffe98cfb000 	C:\WINDOWS\System32\GDI32.dll
0x00007ffe97170000 - 0x00007ffe9727b000 	C:\WINDOWS\System32\gdi32full.dll
0x00007ffe96950000 - 0x00007ffe969ed000 	C:\WINDOWS\System32\msvcp_win.dll
0x00007ffe96d20000 - 0x00007ffe96e20000 	C:\WINDOWS\System32\ucrtbase.dll
0x00007ffe8b240000 - 0x00007ffe8b4da000 	C:\WINDOWS\WinSxS\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.19041.1110_none_60b5254171f9507e\COMCTL32.dll
0x00007ffe98880000 - 0x00007ffe988b0000 	C:\WINDOWS\System32\IMM32.DLL
0x000000006b160000 - 0x000000006b232000 	C:\Program Files\Android\Android Studio\jre\jre\bin\msvcr100.dll
0x000000006b320000 - 0x000000006bb6b000 	C:\Program Files\Android\Android Studio\jre\jre\bin\server\jvm.dll
0x00007ffe98b90000 - 0x00007ffe98b98000 	C:\WINDOWS\System32\PSAPI.DLL
0x00007ffe88490000 - 0x00007ffe8849a000 	C:\WINDOWS\SYSTEM32\VERSION.dll
0x00007ffe93890000 - 0x00007ffe93899000 	C:\WINDOWS\SYSTEM32\WSOCK32.dll
0x00007ffe905e0000 - 0x00007ffe90607000 	C:\WINDOWS\SYSTEM32\WINMM.dll
0x00007ffe98810000 - 0x00007ffe9887b000 	C:\WINDOWS\System32\WS2_32.dll
0x00007ffe8ac70000 - 0x00007ffe8ac7f000 	C:\Program Files\Android\Android Studio\jre\jre\bin\verify.dll
0x00007ffe89a10000 - 0x00007ffe89a39000 	C:\Program Files\Android\Android Studio\jre\jre\bin\java.dll
0x00007ffe877b0000 - 0x00007ffe877c6000 	C:\Program Files\Android\Android Studio\jre\jre\bin\zip.dll
0x00007ffe97470000 - 0x00007ffe97baf000 	C:\WINDOWS\System32\SHELL32.dll
0x00007ffe94a50000 - 0x00007ffe951e0000 	C:\WINDOWS\SYSTEM32\windows.storage.dll
0x00007ffe98030000 - 0x00007ffe98385000 	C:\WINDOWS\System32\combase.dll
0x00007ffe963a0000 - 0x00007ffe963cc000 	C:\WINDOWS\SYSTEM32\Wldp.dll
0x00007ffe98e00000 - 0x00007ffe98eae000 	C:\WINDOWS\System32\SHCORE.dll
0x00007ffe98da0000 - 0x00007ffe98df5000 	C:\WINDOWS\System32\shlwapi.dll
0x00007ffe96890000 - 0x00007ffe968af000 	C:\WINDOWS\SYSTEM32\profapi.dll
0x00007ffe854f0000 - 0x00007ffe8550a000 	C:\Program Files\Android\Android Studio\jre\jre\bin\net.dll
0x00007ffe96090000 - 0x00007ffe960fa000 	C:\WINDOWS\system32\mswsock.dll
0x00007ffe82020000 - 0x00007ffe82033000 	C:\Program Files\Android\Android Studio\jre\jre\bin\nio.dll
0x00007ffe81d90000 - 0x00007ffe81db6000 	C:\Users\sjosu\.gradle\native\29\windows-amd64\native-platform.dll
0x00007ffe8a910000 - 0x00007ffe8a91d000 	C:\Program Files\Android\Android Studio\jre\jre\bin\management.dll
0x00007ffe96280000 - 0x00007ffe96298000 	C:\WINDOWS\SYSTEM32\CRYPTSP.dll
0x00007ffe959b0000 - 0x00007ffe959e4000 	C:\WINDOWS\system32\rsaenh.dll
0x00007ffe96eb0000 - 0x00007ffe96ed7000 	C:\WINDOWS\System32\bcrypt.dll
0x00007ffe96850000 - 0x00007ffe9687e000 	C:\WINDOWS\SYSTEM32\USERENV.dll
0x00007ffe96e20000 - 0x00007ffe96ea3000 	C:\WINDOWS\System32\bcryptprimitives.dll
0x00007ffe962a0000 - 0x00007ffe962ac000 	C:\WINDOWS\SYSTEM32\CRYPTBASE.dll
0x00007ffe95d80000 - 0x00007ffe95dbb000 	C:\WINDOWS\SYSTEM32\IPHLPAPI.DLL
0x00007ffe98d00000 - 0x00007ffe98d08000 	C:\WINDOWS\System32\NSI.dll
0x00007ffe8d8d0000 - 0x00007ffe8d8e7000 	C:\WINDOWS\SYSTEM32\dhcpcsvc6.DLL
0x00007ffe8ee10000 - 0x00007ffe8ee2d000 	C:\WINDOWS\SYSTEM32\dhcpcsvc.DLL
0x00007ffe95dc0000 - 0x00007ffe95e8c000 	C:\WINDOWS\SYSTEM32\DNSAPI.dll

VM Arguments:
jvm_args: -Xmx1536m -Dfile.encoding=windows-1252 -Duser.country=MX -Duser.language=es -Duser.variant 
java_command: org.gradle.launcher.daemon.bootstrap.GradleDaemon 5.4.1
java_class_path (initial): C:\Users\sjosu\.gradle\wrapper\dists\gradle-5.4.1-all\3221gyojl5jsh0helicew7rwx\gradle-5.4.1\lib\gradle-launcher-5.4.1.jar
Launcher Type: SUN_STANDARD

Environment Variables:
PATH=C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\dotnet\;C:\Program Files (x86)\nodejs\;C:\xampp\php;C:\ProgramData\ComposerSetup\bin;C:\Users\sjosu\AppData\Local\Microsoft\WindowsApps;C:\Users\sjosu\AppData\Roaming\npm;C:\Users\sjosu\AppData\Local\Programs\Git\cmd;C:\Users\sjosu\AppData\Local\Programs\Microsoft VS Code\bin
USERNAME=sjosu
OS=Windows_NT
PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 42 Stepping 7, GenuineIntel



---------------  S Y S T E M  ---------------

OS: Windows 10.0 , 64 bit Build 19041 (10.0.19041.1202)

CPU:total 4 (initial active 4) (2 cores per cpu, 2 threads per core) family 6 model 42 stepping 7, cmov, cx8, fxsr, mmx, sse, sse2, sse3, ssse3, sse4.1, sse4.2, popcnt, avx, clmul, ht, tsc, tscinvbit

Memory: 4k page, physical 6098108k(319472k free), swap 8719656k(6056k free)

vm_info: OpenJDK 64-Bit Server VM (25.242-b01) for windows-amd64 JRE (1.8.0_242-release-1644-b01), built by "builder" with MS VC++ 10.0 (VS2010)

time: Wed Oct 20 21:39:57 2021
timezone: Hora de verano central (M??xico)
elapsed time: 202 seconds (0d 0h 3m 22s)