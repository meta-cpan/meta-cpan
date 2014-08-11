DESCRIPTION = "This is a backend for Package::Stash, which provides the functionality \
in a way that's less buggy and much faster. It will be used by default \
if it's \
installed, and should be preferred in all environments with a compiler."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Package-Stash-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DO/DOY/Package-Stash-XS-0.28.tar.gz"

SRC_URI[md5sum] = "9664356ec3be02626cbd3081ec246b70"
SRC_URI[sha256sum] = "23d8c5c25768ef1dc0ce53b975796762df0d6e244445d06e48d794886c32d486"
DEPENDS += "test-fatal-perl"
DEPENDS += "test-requires-perl"

S = "${WORKDIR}/Package-Stash-XS-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
