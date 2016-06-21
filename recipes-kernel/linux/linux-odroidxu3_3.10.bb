inherit kernel
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "\
    git://github.com/hardkernel/linux.git;protocol=git;branch=odroidxu3-3.10.y \
    file://defconfig \
"

SRCREV_odroidxu4 = "ae5b5f99f06f936382edda30522787bdde1248bd"

LINUX_VERSION ?= "3.10"
LINUX_VERSION_EXTENSION = "-odroidxu4"

PV = "${LINUX_VERSION}${LINUX_VERSION_EXTENSION}+git${SRCPV}"

COMPATIBLE_MACHINE = "odroidxu4"

