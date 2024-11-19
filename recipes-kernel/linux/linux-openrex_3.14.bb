# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "FSL Community BSP i.MX6 Linux kernel with backported features and fixes"
DESCRIPTION = "Linux kernel based on Freescale 3.14.52-1.1.0 GA release, used by FSL Community BSP in order to \
provide support for i.MX6 based platforms and include official Linux kernel stable updates, backported \
features and fixes coming from the vendors, kernel community or FSL Community itself."

SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"


SRCBRANCH = "jethro"
LOCALVERSION = "-yocto"

# Update to latest linux commit!
SRCREV = "42cefe45b7f9ef6196369770fc315cc74b465770"

KERNEL_SRC ?= "git://github.com/GustavMgithub/imx6-rex-linux.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH} file://defconfig"

#PV .= "+git${SRCPV}"
PV .= ""

COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex)"
