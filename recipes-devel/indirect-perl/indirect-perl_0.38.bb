DESCRIPTION = "When enabled, this pragma warns about indirect method calls that are \
present in your code."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/indirect"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/V/VP/VPIT/indirect-0.38.tar.gz"

SRC_URI[md5sum] = "c4e2da06c6bd0cc4f7ba5a318bae7f15"
SRC_URI[sha256sum] = "bef9c253d4cf864987dd6d6466067ef7a165f79f18a7cdeee8a80e902e52658e"

S = "${WORKDIR}/indirect-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
