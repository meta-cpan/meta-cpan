DESCRIPTION = ""Spiffy\" is a framework and methodology for doing object oriented (OO) \
programming in Perl. Spiffy combines the best parts of Exporter.pm, \
base.pm, \
mixin.pm and SUPER.pm into one magic foundation class. It attempts to \
fix \
all the nits and warts of traditional Perl OO, in a clean, \
straightforward \
and (perhaps someday) standard way."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Spiffy"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/I/IN/INGY/Spiffy-0.46.tar.gz"

SRC_URI[md5sum] = "2ec7007c111a6bc2775bb7c57673a24b"
SRC_URI[sha256sum] = "8f58620a8420255c49b6c43c5ff5802bd25e4f09240c51e5bf2b022833d41da3"

S = "${WORKDIR}/Spiffy-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
