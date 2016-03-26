inherit kernel
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "\
    git://github.com/hardkernel/linux.git;protocol=git;branch=odroidxu3-3.10.y \
    file://defconfig \
"

SRCREV_odroidxu4 = "e9990ec4844fc16f9c18b67d2613887cc8713f9e"

LINUX_VERSION ?= "3.10"
LINUX_VERSION_EXTENSION = "-odroidxu4"

PV = "${LINUX_VERSION}${LINUX_VERSION_EXTENSION}+git${SRCPV}"

COMPATIBLE_MACHINE = "odroidxu4"

