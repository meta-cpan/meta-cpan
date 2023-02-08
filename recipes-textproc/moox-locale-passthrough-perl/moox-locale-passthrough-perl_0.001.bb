DESCRIPTION = ""MooX::Locale::Passthrough" is made to allow CPAN modules use translator \
API without adding heavy dependencies (external software) or requirements \
(operating resulting solution)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Locale-Passthrough"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-Locale-Passthrough-0.001.tar.gz"

SRC_URI[md5sum] = "fdb07e36b57121421fc1088496c3e09f"
SRC_URI[sha256sum] = "7a05827e52ab5a1dde2ea5c712927b1e58c8d251664d966627adf9dd30ec0512"
RDEPENDS:${PN} += "moo-perl"

S = "${WORKDIR}/MooX-Locale-Passthrough-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
