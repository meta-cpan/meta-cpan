DESCRIPTION = "As with other Pseudo-Random Number Generator (PRNG) algorithms like the \
Mersenne Twister (see Math::Random::MT), this algorithm is designed to take \
some seed information and produce seemingly random results as output."

SECTION = "libs"
LICENSE = "PD | MIT | Artistic-2.0 | GPL-3.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-Random-ISAAC"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/PD;md5=b3597d12946881e13cb3b548d1173851 \
file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266 \
file://${COMMON_LICENSE_DIR}/GPL-3.0-or-later;md5=1c76c4cc354acaac30ed4d5eefea7245 \
"

SRC_URI = "https://cpan.metacpan.org/authors/id/J/JA/JAWNSY/Math-Random-ISAAC-1.004.tar.gz"

SRC_URI[md5sum] = "46110b9a7bb96fe641bdfaf35bdafec5"
SRC_URI[sha256sum] = "2773f02fbf207e9745e76a037df08bf5a8cc987ed23c57040ce7f7b1561f2b7c"
RRECOMMENDS:${PN} += "math-random-isaac-xs-perl"
DEPENDS += "test-nowarnings-perl-native"

S = "${WORKDIR}/Math-Random-ISAAC-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
