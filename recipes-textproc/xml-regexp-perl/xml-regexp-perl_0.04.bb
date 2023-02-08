DESCRIPTION = "This package contains regular expressions for the following XML tokens: \
BaseChar, Ideographic, Letter, Digit, Extender, CombiningChar, NameChar, \
EntityRef, CharRef, Reference, Name, NmToken, and AttValue."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-RegExp"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TJ/TJMATHER/XML-RegExp-0.04.tar.gz"

SRC_URI[md5sum] = "2e38ea2340f2d2eb56bd81c4d739fbe0"
SRC_URI[sha256sum] = "df1990096036085c8e2d45904fe180f82bfed40f1a7e05243f334ea10090fc54"

S = "${WORKDIR}/XML-RegExp-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
