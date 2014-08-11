DESCRIPTION = "As with other Pseudo-Random Number Generator (PRNG) algorithms like the \
Mersenne Twister (see Math::Random::MT), this algorithm is designed to \
take \
some seed information and produce seemingly random results as output."

SECTION = "libs"
LICENSE = "unknown(unrestricted)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-Random-ISAAC"

LIC_FILES_CHKSUM = "unknown(unrestricted)"

SRC_URI = "http://cpan.metacpan.org/authors/id/J/JA/JAWNSY/Math-Random-ISAAC-1.004.tar.gz"

SRC_URI[md5sum] = "46110b9a7bb96fe641bdfaf35bdafec5"
SRC_URI[sha256sum] = "2773f02fbf207e9745e76a037df08bf5a8cc987ed23c57040ce7f7b1561f2b7c"
RRECOMMENDS_${PV} += "math-random-isaac-xs-perl"
DEPENDS += "test-nowarnings-perl"

S = "${WORKDIR}/Math-Random-ISAAC-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
