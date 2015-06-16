DESCRIPTION = ""Sub::Identify\" allows you to retrieve the real name of code \
references."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Identify"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RG/RGARCIA/Sub-Identify-0.10.tar.gz"

SRC_URI[md5sum] = "08bb2f22c85007d2cbb0eb9541c77355"
SRC_URI[sha256sum] = "55586b9cb3c0e63b6c6dede5a8c00af48de6643592ea100fe1e6146e1e93ee20"

S = "${WORKDIR}/Sub-Identify-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
