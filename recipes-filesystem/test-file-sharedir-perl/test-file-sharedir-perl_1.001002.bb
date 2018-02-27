DESCRIPTION = "Create a Fake ShareDir for your modules for testing."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-File-ShareDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KE/KENTNL/Test-File-ShareDir-1.001002.tar.gz"

SRC_URI[md5sum] = "ec31466aa44c1cd56c6cb51d7ec3a5de"
SRC_URI[sha256sum] = "b33647cbb4b2f2fcfbde4f8bb4383d0ac95c2f89c4c5770eb691f1643a337aad"
RDEPENDS_${PN} += "class-tiny-perl"
RDEPENDS_${PN} += "file-copy-recursive-perl"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "path-tiny-perl"
RDEPENDS_${PN} += "scope-guard-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Test-File-ShareDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
