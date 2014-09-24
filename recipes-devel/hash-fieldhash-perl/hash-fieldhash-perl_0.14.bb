DESCRIPTION = ""Hash::FieldHash\" provides the field hash mechanism which supports the \
inside-out technique."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Hash-FieldHash"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GF/GFUJI/Hash-FieldHash-0.14.tar.gz"

SRC_URI[md5sum] = "343747e35714e968ff3db39609e246ca"
SRC_URI[sha256sum] = "e1f7d0e97dd14afb2dddf64052e503c05467f73f51756ea7b647d59cab0cf721"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "perl"

S = "${WORKDIR}/Hash-FieldHash-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
