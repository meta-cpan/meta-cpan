DESCRIPTION = "Plack is a set of tools for using the PSGI stack. It contains middleware \
components, a reference server and utilities for Web application \
frameworks. Plack is like Ruby's Rack or Python's Paste for WSGI."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Plack"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Plack-1.0048.tar.gz"

SRC_URI[md5sum] = "36282b473b4521219c44a9db437b650f"
SRC_URI[sha256sum] = "30f5f25e19b437859156a2526f61ca9ab708d50d5730c279189403aabfe542a6"
RDEPENDS:${PN} += "apache-logformat-compiler-perl"
RDEPENDS:${PN} += "cookie-baker-perl"
RDEPENDS:${PN} += "devel-stacktrace-ashtml-perl"
RDEPENDS:${PN} += "devel-stacktrace-perl"
RDEPENDS:${PN} += "file-sharedir-perl"
RDEPENDS:${PN} += "filesys-notify-simple-perl"
RDEPENDS:${PN} += "hash-multivalue-perl"
RDEPENDS:${PN} += "http-entity-parser-perl"
RDEPENDS:${PN} += "http-headers-fast-perl"
RDEPENDS:${PN} += "http-message-perl"
RDEPENDS:${PN} += "stream-buffered-perl"
RDEPENDS:${PN} += "test-tcp-perl"
RDEPENDS:${PN} += "try-tiny-perl"
RDEPENDS:${PN} += "uri-perl"
RDEPENDS:${PN} += "www-form-urlencoded-perl"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Plack-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
