DESCRIPTION = "Text::CSV provides facilities for the composition and decomposition of \
comma-separated values using Text::CSV_XS or its pure Perl version."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-CSV"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAKAMAKA/Text-CSV-1.33.tar.gz"

SRC_URI[md5sum] = "358e2f2ddb6c7746c91e49a7db97b634"
SRC_URI[sha256sum] = "9c5b8fb9baffd58f02ed2b3f0b6d9a6454198f18a80e7f3a049680ddbdb24115"

S = "${WORKDIR}/Text-CSV-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
