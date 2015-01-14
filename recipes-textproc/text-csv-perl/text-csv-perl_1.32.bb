DESCRIPTION = "Text::CSV provides facilities for the composition and decomposition of \
comma-separated values using Text::CSV_XS or its pure Perl version."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-CSV"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MA/MAKAMAKA/Text-CSV-1.32.tar.gz"

SRC_URI[md5sum] = "f476205648694a64684be2ab29e44e19"
SRC_URI[sha256sum] = "b49fea66d75a1419a76b0b2b30144d97e1f69728928c06ed08405874fd8ff9af"

S = "${WORKDIR}/Text-CSV-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
