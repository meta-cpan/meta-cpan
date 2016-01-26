DESCRIPTION = "As with other Pseudo-Random Number Generator (PRNG) algorithms like the \
Mersenne Twister (see Math::Random::MT), this algorithm is designed to \
take \
some seed information and produce seemingly random results as output."

SECTION = "libs"
LICENSE = "MIT | Artistic-1.0 | GPL-1.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-Random-ISAAC"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d \
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "http://cpan.metacpan.org/authors/id/J/JA/JAWNSY/Math-Random-ISAAC-1.004.tar.gz"

SRC_URI[md5sum] = "46110b9a7bb96fe641bdfaf35bdafec5"
SRC_URI[sha256sum] = "2773f02fbf207e9745e76a037df08bf5a8cc987ed23c57040ce7f7b1561f2b7c"
RRECOMMENDS_${PN} += "math-random-isaac-xs-perl"
DEPENDS += "test-nowarnings-perl-native"

S = "${WORKDIR}/Math-Random-ISAAC-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
