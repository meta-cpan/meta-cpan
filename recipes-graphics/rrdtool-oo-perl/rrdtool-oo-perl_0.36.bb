DESCRIPTION = ""RRDTool::OO\" is an object-oriented interface to Tobi Oetiker's round \
robin database tool *rrdtool*. It uses *rrdtool*'s \"RRDs\" module to \
get access to *rrdtool*'s shared library."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/RRDTool-OO"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSCHILLI/RRDTool-OO-0.36.tar.gz"

SRC_URI[md5sum] = "a29680794184537d60fcf8de7b6a9ffc"
SRC_URI[sha256sum] = "4810c245926c33ea9da75ae4443981d96036fdea7ee6c735f8e1ef4b0addfbd5"
DEPENDS += "rrdtool-native"
RDEPENDS_${PN} += "rrdtool-perl"
RDEPENDS_${PN} += "log-log4perl-perl"

S = "${WORKDIR}/RRDTool-OO-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
