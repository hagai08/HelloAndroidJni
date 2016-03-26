#include <jni.h>
#include <stdio.h>

JNIEXPORT jstring JNICALL
Java_com_example_hagai08_helloandroidjni_MainActivity_fibonacciJni(JNIEnv *env, jobject instance, int num) {

    // TODO




    int result = fibonacci(num);


    char str[15];
    sprintf(str, "%d", result);

    return (*env)->NewStringUTF(env, str);





}

int fibonacci(int n)
{
    if ( n == 0 )
        return 0;
    else if ( n == 1 )
        return 1;
    else
        return ( fibonacci(n-1) + fibonacci(n-2) );
}