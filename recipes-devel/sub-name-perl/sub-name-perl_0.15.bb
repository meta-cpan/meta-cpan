DESCRIPTION = "Perl module to (re)name a sub"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Name"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Sub-Name-0.15.tar.gz"

SRC_URI[md5sum] = "9711808eae4e8b792ed9316daa2d80d4"
SRC_URI[sha256sum] = "dabc9a4abcbe067d120ce005b4203b8a44291cbda013900152ba19a1e7c1c8c8"

S = "${WORKDIR}/Sub-Name-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
