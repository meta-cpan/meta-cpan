DESCRIPTION = "Devel::CheckBin is a perl module that checks whether a particular \
command is available."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-CheckBin"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/Devel-CheckBin-0.02.tar.gz"

SRC_URI[md5sum] = "aaa02a1262bc3eb3a7e5566590cb7814"
SRC_URI[sha256sum] = "f5643d4a11eaf6309137a377b907f0e25d9d966699c1144c950e789954d5e13c"
DEPENDS += "perl"

S = "${WORKDIR}/Devel-CheckBin-${PV}"

inherit cpan_build

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
