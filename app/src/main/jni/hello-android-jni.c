#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_example_hagai08_helloandroidjni_MainActivity_getMsgFromJni(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "Hello From Jni");





}
/*
int Fibonacci(int n)
{
    if ( n == 0 )
        return 0;
    else if ( n == 1 )
        return 1;
    else
        return ( Fibonacci(n-1) + Fibonacci(n-2) );
}