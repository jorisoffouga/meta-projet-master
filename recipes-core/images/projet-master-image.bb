SUMMARY = "TODO"
DESCRIPTION = "TODO"
LICENSE = "MIT"

require recipes-core/images/core-image-base.bb

inherit image-buildinfo
inherit populate_sdk_qt5

IMAGE_FEATURES_append = " \
	ssh-server-dropbear \
"

# Misc
IMAGE_INSTALL_append = " \
	openssh-sftp-server \
	iptables \
	curl \
	can-utils \
	iproute2 \
	i2c-tools \
	libgpiod \
	spitools \
	parted \
	e2fsprogs-e2fsck \
	e2fsprogs-resize2fs \
	e2fsprogs-mke2fs \
	dnsmasq \
	hostapd \
	mosquitto \
"

# Kernel
IMAGE_INSTALL_append = " \
	kernel-image \
	kernel-devicetree \
	kernel-modules \
	haveged \
	packagegroup-base \
"
# QT5
IMAGE_INSTALL_append = " \
	packagegroup-qt5 \
"

IMAGE_BUILDINFO_VARS = " \
    BB_VERSION \
    BUILD_SYS  \
    NATIVELSBSTRING \
    TARGET_SYS \
    MACHINE \
    DISTRO \
    DISTRO_VERSION \
    TUNE_FEATURES \
    TARGET_FPU \
"

buildinfo () {
cat > ${IMAGE_ROOTFS}${sysconfdir}/${MACHINE}-build-info << END
Build Configuration:
${@buildinfo_target(d)}
${@get_layer_revs(d)}
END
}	

export IMAGE_BASENAME = "projet-master-image"
