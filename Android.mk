LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := androidVNC
LOCAL_MODULE_TAGS := optional
LOCAL_PACKAGE_NAME := androidVNC

androidVNC_root  := $(LOCAL_PATH)
androidVNC_dir   := app
androidVNC_out   := $(PWD)/$(OUT_DIR)/target/common/obj/APPS/$(LOCAL_MODULE)_intermediates
androidVNC_build := $(androidVNC_root)/$(androidVNC_dir)/build
androidVNC_apk   := build/outputs/apk/$(androidVNC_dir)-release-unsigned.apk

$(androidVNC_root)/$(androidVNC_dir)/$(androidVNC_apk):
	rm -Rf $(androidVNC_build)
	mkdir -p $(androidVNC_out)
	ln -sf $(androidVNC_out) $(androidVNC_build)
	cd $(androidVNC_root)/$(androidVNC_dir) && gradle assembleRelease

LOCAL_CERTIFICATE := platform
LOCAL_PRIVILEGED_MODULE := true
LOCAL_SRC_FILES := $(androidVNC_dir)/$(androidVNC_apk)
LOCAL_MODULE_CLASS := APPS
LOCAL_MODULE_SUFFIX := $(COMMON_ANDROID_PACKAGE_SUFFIX)

include $(BUILD_PREBUILT)