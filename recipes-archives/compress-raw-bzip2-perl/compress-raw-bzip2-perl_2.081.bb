DESCRIPTION = ""Compress::Raw::Bzip2" provides an interface to the in-memory \
compression/uncompression functions from the bzip2 compression library."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Compress-Raw-Bzip2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/Compress-Raw-Bzip2-2.081.tar.gz"

SRC_URI[md5sum] = "25fa9c9cc4fd3250b65b91694f9eac2e"
SRC_URI[sha256sum] = "8692b5c9db91954408e24e805fbfda222879da80d89d9410791421e3e5bc3520"

S = "${WORKDIR}/Compress-Raw-Bzip2-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
