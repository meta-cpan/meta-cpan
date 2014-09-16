DESCRIPTION = "This module has only one function, which is also exported by default:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Name"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/ET/ETHER/Sub-Name-0.12.tar.gz"

SRC_URI[md5sum] = "421afad5e34c0b4f753d578d99be535f"
SRC_URI[sha256sum] = "06c4a2fcfb7223eeea6cc2b3f507e51f02fbf982e0c0ff1061deefb32f62b4e9"
DEPENDS += "devel-checkbin-perl-native"
RECOMMENDS += "perl"

S = "${WORKDIR}/Sub-Name-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
