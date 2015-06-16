DESCRIPTION = "tolerance ranges for inexact numbers"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Number-Tolerant"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Number-Tolerant-1.706.tar.gz"

SRC_URI[md5sum] = "228c6c0d44dc9d4a2f17e9c5d31a2c5b"
SRC_URI[sha256sum] = "fda9af8629d6d5ebccf9b3fbb408a7c9f508c564e7dcf28a2fa2b4b2436a4087"
RDEPENDS_${PN} += "sub-exporter-perl"
DEPENDS += "test-simple-perl-native"

S = "${WORKDIR}/Number-Tolerant-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
