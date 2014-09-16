DESCRIPTION = "By default, this module exports a single hash (%RE) that stores or \
generates commonly needed regular expressions (see \"List of available \
patterns\")."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Regexp-Common"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AB/ABIGAIL/Regexp-Common-2013031301.tar.gz"

SRC_URI[md5sum] = "2b9c335312dcfd9980ff7acbad0e5905"
SRC_URI[sha256sum] = "729a8198d264aa64ecbb233ff990507f97fbb66bda746b95f3286f50f5f25c84"

S = "${WORKDIR}/Regexp-Common-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
