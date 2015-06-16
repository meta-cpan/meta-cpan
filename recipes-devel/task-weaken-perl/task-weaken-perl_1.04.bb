DESCRIPTION = "One recurring problem in modules that use Scalar::Util's \"weaken\" \
function is that it is not present in the pure-perl variant."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Task-Weaken"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/Task-Weaken-1.04.tar.gz"

SRC_URI[md5sum] = "affd0c395515bb95d29968404d7fe6de"
SRC_URI[sha256sum] = "67e271c55900fe7889584f911daa946e177bb60c8af44c32f4584b87766af3c4"

S = "${WORKDIR}/Task-Weaken-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
