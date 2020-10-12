DESCRIPTION = "See Math::Random::ISAAC for the full description."

SECTION = "libs"
LICENSE = "MIT | Artistic-1.0 | GPL-1.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-Random-ISAAC-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d \
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "http://cpan.metacpan.org/authors/id/J/JA/JAWNSY/Math-Random-ISAAC-XS-1.004.tar.gz"

SRC_URI[md5sum] = "e38d5a1ab12ca251034f89ab5939f758"
SRC_URI[sha256sum] = "9af790eb92d1c6330d33c6daa8decf8a9c5dcc87b81779d6b12e14b931c3b87b"
RRECOMMENDS_${PN} += "math-random-isaac-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-nowarnings-perl-native"

S = "${WORKDIR}/Math-Random-ISAAC-XS-${PV}"

inherit cpan_build

EXTRA_CPAN_BUILD_FLAGS="--config cc="${CC}" --config ccflags="${CFLAGS}" --config ld="${CCLD} ${LDFLAGS}""

do_compile() {
	export LD="${CCLD} ${LDFLAGS}"
	cpan_build_do_compile
}

FILES_${PN}-dbg += "${PERLLIBDIRS}/auto/*/*/*/*/.debug \
                ${PERLLIBDIRS}/vendor_perl/${PERLVERSION}/auto/*/*/*/*/.debug"

BBCLASSEXTEND = "native"
