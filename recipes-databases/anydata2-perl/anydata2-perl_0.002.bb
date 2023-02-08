DESCRIPTION = "The rather wacky idea behind this module is that any data, regardless of \
source or format should be accessible and maybe modifiable with the same \
simple set of methods."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/AnyData2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/AnyData2-0.002.tar.gz"

SRC_URI[md5sum] = "1dd5b0715a743c1f0aaf47bbbba27891"
SRC_URI[sha256sum] = "2945d041deda0feb565ac4390dbdd68645a51f21dbe2d9c2454e346160c77303"
RDEPENDS:${PN} += "list-moreutils-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RECOMMENDS += "text-csv-perl-native"
RECOMMENDS += "text-csv-xs-perl-native"

S = "${WORKDIR}/AnyData2-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
