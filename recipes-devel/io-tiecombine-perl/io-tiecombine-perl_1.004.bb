DESCRIPTION = "produce tied (and other) separate but combined variables"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-TieCombine"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/IO-TieCombine-1.004.tar.gz"

SRC_URI[md5sum] = "c36ad78c5787e064f94d8a3018193432"
SRC_URI[sha256sum] = "60106b571448f598706d6df4214ab4f7d4391d942e23a0ff6c5c49b99af49e2b"

S = "${WORKDIR}/IO-TieCombine-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
