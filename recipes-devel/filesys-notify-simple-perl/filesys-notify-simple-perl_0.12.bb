DESCRIPTION = "Filesys::Notify::Simple is a simple but unified interface to get \
notifications of changes to a given filesystem path. It utilizes \
inotify2 on \
Linux, fsevents on OS X, kqueue on FreeBSD and \
FindFirstChangeNotification \
on Windows if they're installed, with a fallback to the full directory \
scan \
if they're not available."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Filesys-Notify-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Filesys-Notify-Simple-0.12.tar.gz"

SRC_URI[md5sum] = "d1886453241db0a034e5aacd02ee1f72"
SRC_URI[sha256sum] = "ecafcdfdebd0706fdf1bb7ee1bbbc304a65d70c6cc05255d14fd133da6aca60d"
DEPENDS += "test-sharedfork-perl-native"

S = "${WORKDIR}/Filesys-Notify-Simple-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
