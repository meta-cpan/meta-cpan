DESCRIPTION = "Instances of this class represent the text of a single invocation of a CLI \
command, allowing it to be incrementally parsed and broken into individual \
tokens during dispatch and invocation."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Commandable"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Commandable-0.04.tar.gz"

SRC_URI[md5sum] = "7a273d5e0534463ebad0e76d926c5e64"
SRC_URI[sha256sum] = "606b519da0d8f3639259b66de96da0df181023f5c46f300f12e4ad7eaf0bdcab"
RDEPENDS_${PN} += "module-pluggable-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Commandable-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
