DESCRIPTION = "When you import a function into a Perl package, it will naturally also be \
available as a method."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/namespace-autoclean"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/namespace-autoclean-0.29.tar.gz"

SRC_URI[md5sum] = "39b38c776cd1f0ee03cc70781a2f2798"
SRC_URI[sha256sum] = "45ebd8e64a54a86f88d8e01ae55212967c8aa8fed57e814085def7608ac65804"
RDEPENDS_${PN} += "b-hooks-endofscope-perl"
RDEPENDS_${PN} += "namespace-clean-perl"
RDEPENDS_${PN} += "sub-identify-perl"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/namespace-autoclean-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
