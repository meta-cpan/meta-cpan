DESCRIPTION = "Plack is a set of tools for using the PSGI stack. It contains middleware \
components, a reference server and utilities for Web application \
frameworks. Plack is like Ruby's Rack or Python's Paste for WSGI."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Plack"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Plack-1.0047.tar.gz"

SRC_URI[md5sum] = "9d37086aec1b29bab52a9575687e3557"
SRC_URI[sha256sum] = "322c93f5acc0a0f0e11fd4a76188f978bdc14338a9f1df3ae535227017046561"
RDEPENDS_${PN} += "apache-logformat-compiler-perl"
RDEPENDS_${PN} += "cookie-baker-perl"
RDEPENDS_${PN} += "devel-stacktrace-ashtml-perl"
RDEPENDS_${PN} += "devel-stacktrace-perl"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "filesys-notify-simple-perl"
RDEPENDS_${PN} += "hash-multivalue-perl"
RDEPENDS_${PN} += "http-entity-parser-perl"
RDEPENDS_${PN} += "http-headers-fast-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "stream-buffered-perl"
RDEPENDS_${PN} += "test-tcp-perl"
RDEPENDS_${PN} += "try-tiny-perl"
RDEPENDS_${PN} += "uri-perl"
RDEPENDS_${PN} += "www-form-urlencoded-perl"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Plack-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
