DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate \
Authority certificates in a form that can be consumed by modules and \
libraries based on OpenSSL."

SECTION = "libs"
LICENSE = "MPL-1.1|GPL-2.0|LGPL-2.1"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Mozilla-CA"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-1.1;md5=1d38e87ed8d522c49f04e1efe0fab3ab \
    file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6 \
    file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AB/ABH/Mozilla-CA-20130114.tar.gz"

SRC_URI[md5sum] = "45a42082dbd68cf25869ceb2aa49d5b2"
SRC_URI[sha256sum] = "82342614add1dbca8a00daa1ee55af3e0036245aed7d445537918c045008ccd7"

S = "${WORKDIR}/Mozilla-CA-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
