DESCRIPTION = "See Math::Random::ISAAC for the full description."

SECTION = "libs"
LICENSE = "unknown(unrestricted)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-Random-ISAAC-XS"

LIC_FILES_CHKSUM = "unknown(unrestricted)"

SRC_URI = "http://cpan.metacpan.org/authors/id/J/JA/JAWNSY/Math-Random-ISAAC-XS-1.004.tar.gz"

SRC_URI[md5sum] = "e38d5a1ab12ca251034f89ab5939f758"
SRC_URI[sha256sum] = "9af790eb92d1c6330d33c6daa8decf8a9c5dcc87b81779d6b12e14b931c3b87b"
RRECOMMENDS_${PV} += "math-random-isaac-perl"
DEPENDS += "perl"
DEPENDS += "test-nowarnings-perl"

S = "${WORKDIR}/Math-Random-ISAAC-XS-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
