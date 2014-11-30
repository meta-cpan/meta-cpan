DESCRIPTION = "App::Cmd is intended to make it easy to write complex command-line \
applications without having to think about most of the annoying things \
usually involved."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/App-Cmd"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/App-Cmd-0.326.tar.gz"

SRC_URI[md5sum] = "283452726557f7e6cdb55bdc9998f121"
SRC_URI[sha256sum] = "2b6ddd498dd8d8b28b9a4656a6c69479b5bc5b1e46660dd8670e9c5055b8dbfc"
RDEPENDS_${PN} += "capture-tiny-perl"
RDEPENDS_${PN} += "class-load-perl"
RDEPENDS_${PN} += "data-optlist-perl"
RDEPENDS_${PN} += "getopt-long-descriptive-perl"
RDEPENDS_${PN} += "io-tiecombine-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "string-rewriteprefix-perl"
RDEPENDS_${PN} += "sub-exporter-perl"
RDEPENDS_${PN} += "sub-install-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/App-Cmd-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
