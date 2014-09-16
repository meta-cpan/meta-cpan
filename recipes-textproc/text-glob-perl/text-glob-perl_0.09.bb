DESCRIPTION = "Text::Glob implements glob(3) style matching that can be used to match \
against text, rather than fetching names from a filesystem. If you want \
to \
do full file globbing use the File::Glob module instead."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-Glob"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RC/RCLAMP/Text-Glob-0.09.tar.gz"

SRC_URI[md5sum] = "1daa10e087f891c49b720a5c551a024b"
SRC_URI[sha256sum] = "a5a121da026fbc4cc8c1065cfbe76ab5110e88091f454e70ee8c23a933372753"
DEPENDS += "perl"

S = "${WORKDIR}/Text-Glob-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
