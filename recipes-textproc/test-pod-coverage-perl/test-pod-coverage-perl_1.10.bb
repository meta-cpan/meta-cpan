DESCRIPTION = "Test::Pod::Coverage is used to create a test for your distribution, to \
ensure that all relevant files in your distribution are appropriately \
documented in pod."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Pod-Coverage"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEILB/Test-Pod-Coverage-1.10.tar.gz"

SRC_URI[md5sum] = "c9ea5f4182415b13d2db18484a38c01b"
SRC_URI[sha256sum] = "48c9cca9f7d99eee741176445b431adf09c029e1aa57c4703c9f46f7601d40d4"
RDEPENDS_${PN} += "pod-coverage-perl"

S = "${WORKDIR}/Test-Pod-Coverage-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
