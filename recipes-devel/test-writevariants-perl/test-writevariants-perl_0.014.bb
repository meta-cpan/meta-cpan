DESCRIPTION = "Test::WriteVariants is a utility to create variants of a common test."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-WriteVariants"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Test-WriteVariants-0.014.tar.gz"

SRC_URI[md5sum] = "e88e2e3559574c661c17d34c94eb3118"
SRC_URI[sha256sum] = "6349c2bdee1533463061ad8eeea8621d8f8c0d4f9d7ae1b1eecdaf03cc906487"
RDEPENDS_${PN} += "data-tumbler-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RRECOMMENDS_${PN} += "file-find-rule-perl"
DEPENDS += "test-directory-perl-native"
DEPENDS += "test-most-perl-native"

S = "${WORKDIR}/Test-WriteVariants-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
