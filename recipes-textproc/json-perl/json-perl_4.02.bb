DESCRIPTION = "This module is a thin wrapper for JSON::XS-compatible modules with a few \
additional features. All the backend modules convert a Perl data structure \
to a JSON text and vice versa. This module uses JSON::XS by default, and \
when JSON::XS is not available, falls back on JSON::PP, which is in the \
Perl core since 5.14. If JSON::PP is not available either, this module then \
falls back on JSON::backportPP (which is actually JSON::PP in a different \
.pm file) bundled in the same distribution as this module. You can also \
explicitly specify to use Cpanel::JSON::XS, a fork of JSON::XS by Reini \
Urban."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/JSON"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/JSON-4.02.tar.gz"

SRC_URI[md5sum] = "63a331b4630d48f8dbbe3758cc03bd21"
SRC_URI[sha256sum] = "444a88755a89ffa2a5424ab4ed1d11dca61808ebef57e81243424619a9e8627c"

S = "${WORKDIR}/JSON-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
