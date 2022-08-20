##include <jni.h>
#ifndef _Included_NativeDemo
##define _Included_NativeDemo
extern "C" {
#endif

JNIEXPORT void JNICALL Java_NativeDemo_test(JNIEnv *, jobject);

#ifdef __cplusplus
}

#endif
#endif