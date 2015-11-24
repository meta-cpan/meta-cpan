DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate \
Authority certificates in a form that can be consumed by modules and \
libraries based \
on OpenSSL."

SECTION = "libs"
LICENSE = "MPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Mozilla-CA"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABH/Mozilla-CA-20150826.tar.gz"

SRC_URI[md5sum] = "52de059194004192345687f7a2f88224"
SRC_URI[sha256sum] = "c159d134175db0723a347649961a8f83769d4e20e76e55e040286e1099f71369"

S = "${WORKDIR}/Mozilla-CA-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
