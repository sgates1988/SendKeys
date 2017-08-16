#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_sg9065_sendkeys_Welcome_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "WELCOME TO SENDKEYS";
    return env->NewStringUTF(hello.c_str());
}
