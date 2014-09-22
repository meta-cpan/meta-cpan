DESCRIPTION = "Manipulating stashes (Perl's symbol tables) is occasionally necessary, \
but incredibly messy, and easy to get wrong. This module hides all of \
that \
behind a simple API."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Package-Stash"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DO/DOY/Package-Stash-0.37.tar.gz"

SRC_URI[md5sum] = "7e47a8261312e1cf3d12bd2007916b66"
SRC_URI[sha256sum] = "06ab05388f9130cd377c0e1d3e3bafeed6ef6a1e22104571a9e1d7bfac787b2c"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "module-implementation-perl"
RRECOMMENDS_${PN} += "package-stash-xs-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Package-Stash-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
