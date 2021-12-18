extern crate jni_sys;

use jni_sys::*;

#[no_mangle]
#[allow(unused_variables, non_snake_case)]
pub extern fn Java_be4rjp_jnitest_JNIUtil_print(jre: *mut JNIEnv, class: jclass){
    println!("Hello World from rust!")
}