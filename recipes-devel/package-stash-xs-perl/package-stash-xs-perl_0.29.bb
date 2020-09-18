DESCRIPTION = "This is a backend for Package::Stash, which provides the functionality in a \
way that's less buggy and much faster. It will be used by default if it's \
installed, and should be preferred in all environments with a compiler."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Package-Stash-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Package-Stash-XS-0.29.tar.gz"

SRC_URI[md5sum] = "e5b58846a01aa39c36605e071c306dcc"
SRC_URI[sha256sum] = "d3676ba94641e03d6a30e951f09266c4c3ca3f5b58aa7b314a67f28e419878aa"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Package-Stash-XS-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
