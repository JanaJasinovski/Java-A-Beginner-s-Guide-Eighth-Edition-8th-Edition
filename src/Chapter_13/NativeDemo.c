#include <jni.h>
#include "NativeDemo.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_NativeDemo_test(JNIEnv *, jobject);
{
    jclass cls;
    jfieldID fid;
    jint i;

    cls = (*env) -> GetObjectClass(env, obj);
    fid = (*env) -> GetFieldID(env, cls, "i", "I");

    if(fid == 0){
        return;
    }

    i = (*env) -> GetIntField(env, obj, fid);
    printf("%d", i);
    (*env) -> SetIntField(env, obj, fid, 2*i);
}