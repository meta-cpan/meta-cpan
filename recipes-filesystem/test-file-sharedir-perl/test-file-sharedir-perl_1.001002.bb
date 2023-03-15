DESCRIPTION = ""Test::File::ShareDir" is some low level plumbing to enable a distribution \
to perform tests while consuming its own "share" directories in a manner \
similar to how they will be once installed."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-File-ShareDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KE/KENTNL/Test-File-ShareDir-1.001002.tar.gz"

SRC_URI[md5sum] = "ec31466aa44c1cd56c6cb51d7ec3a5de"
SRC_URI[sha256sum] = "b33647cbb4b2f2fcfbde4f8bb4383d0ac95c2f89c4c5770eb691f1643a337aad"
RDEPENDS:${PN} += "class-tiny-perl"
RDEPENDS:${PN} += "file-copy-recursive-perl"
RDEPENDS:${PN} += "file-sharedir-perl"
RDEPENDS:${PN} += "path-tiny-perl"
RDEPENDS:${PN} += "scope-guard-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Test-File-ShareDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
